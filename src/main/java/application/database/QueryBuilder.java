package application.database;
import application.helpers.Column;
import application.helpers.DBHelper;
import application.helpers.EnumHelper;
import application.helpers.Table;

import java.util.List;

public class QueryBuilder {
    private StringBuilder query;

    public QueryBuilder() {
        query = new StringBuilder();
    }

    public QueryBuilder select(Table table, Column... columns) {
        query.append("SELECT ");
        if (columns.length > 0) {
            addColumns(columns);
        } else {
            query.append("*");
        }
        query.append(" FROM ").append(EnumHelper.getDBName(table));
        return this;
    }

    public QueryBuilder where(Column column, boolean useLike) {
        query.append(" WHERE ")
                .append(EnumHelper.getDBName(column))
                .append((useLike ? " LIKE " : " = "))
                .append("?");
        return this;
    }

    public QueryBuilder insert(Table table, Column... columns) {
        query.append("INSERT INTO ")
                .append(EnumHelper.getDBName(table));

        int questionMark = (columns.length > 0 ? columns.length : table.COL_NUMBER);
        if(columns.length > 0) {
            query.append("(");
            addColumns(columns);
            query.append(")");
        }
        prepareValues(questionMark);
        return this;
    }

    public QueryBuilder selectAggregate(Table table, String aggregatedName, String asText, Column... columns) {
        query.append("SELECT ")
                .append(aggregatedName)
                .append("(*) AS ")
                .append(asText)
                .append(" FROM ").append(EnumHelper.getDBName(table));
        return this;
    }

    private void addColumns(Column... columns) {
        for (Column column: columns) {
            query.append(EnumHelper.getDBName(column)).append(", ");
        }
        query.setLength(query.length() - 2);
    }

    private void prepareValues(int repeat) {
        query.append("VALUES (")
                .append("?,".repeat(repeat));
        query.setLength(query.length() - 1);
        query.append(")");
    }

    public String build() {
        query.append(";");
        return query.toString();
    }

}