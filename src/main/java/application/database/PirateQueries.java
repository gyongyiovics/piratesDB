package application.database;

import application.helpers.Aggregates;
import application.helpers.Column;
import application.helpers.Table;
import application.models.Pirate;

import java.sql.*;

public class PirateQueries {
    DBEngine engine = new DBEngine();
    Connection connection = engine.connect();

    public PirateQueries() {
    }

    public PirateQueries(DBEngine engine) {
        this.engine = engine;
    }

    //SELECT *

    public Pirate findPirate(String name) {
        String query = new QueryBuilder()
                .select(Table.PIRATE)
                .where(Column.CAPTAIN_NAME, false)
                .build();

        Pirate pirate = null;

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String pirateName = rs.getString("pirate_name");
                pirate = new Pirate(pirateName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pirate;
    }

    public Integer countRows(){
        String query = new QueryBuilder().selectAggregate(Table.PIRATE, Aggregates.COUNT.name(),"rowcount").build();
        int count = 0;

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                count = rs.getInt("rowcount");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }


}
