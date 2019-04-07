package sample;

import java.sql.*;
import java.util.ArrayList;
import Connector.JDBCConnector;


public class JdbcTest {

//    static final String username = "root";
//    static final String password = "mySQL_Password123";
//    static final String jdbcConnection = "jdbc:mysql://127.0.0.1:3306/sakila";
//
//    private static Connection connection = null;
    private  Statement statement = null;

    private ResultSet resultSet = null;
    private PreparedStatement preparedStatement;

//    public static void ConnectToDB(){
//        try{
//            connection = DriverManager.getConnection(jdbcConnection,username,password);
//        }catch (SQLException q){
//        }
//    }

    public  ArrayList<FilmObject> filmObjects(){
        ArrayList<FilmObject> filmObjectArrayList = new ArrayList<>();
        try {
            resultSet = JDBCConnector.getInstance().createStatement("SELECT * FROM sakila.film a \n" +
                    "inner join film_category f\n" +
                    "on a.film_id = f.film_id\n" +
                    "inner join category c on \n" +
                    "f.category_id = c.category_id\n" +
                    "inner join language la \n" +
                    "on  a.language_id = la.language_id\n" +
                    "order by a.film_id").executeQuery();


//            statement = connection.createStatement();
            //JDBCConnector.getInstance().connect().createStatement();
//
//            resultSet = statement.executeQuery("SELECT * FROM sakila.film a \n" +
//                    "inner join film_category f\n" +
//                    "on a.film_id = f.film_id\n" +
//                    "inner join category c on \n" +
//                    "f.category_id = c.category_id\n" +
//                    "inner join language la \n" +
//                    "on  a.language_id = la.language_id\n" +
//                    "order by a.film_id");

            while (resultSet.next()){
//                FilmObject object =  new FilmObject(resultSet.getInt("film_id"),resultSet.getString("title"),resultSet.getString("description"),resultSet.getString("release_year"),resultSet.getString(21), resultSet.getDouble("rental_duration"),
//                        resultSet.getDouble("rental_rate"), resultSet.getInt("length"), resultSet.getDouble("replacement_cost"), resultSet.getString("special_features"),resultSet.getString("rating"),resultSet.getString(18));
//                filmObjectArrayList.add(object);
                FilmObject object =  new FilmObject(resultSet.getInt("film_id"),resultSet.getString("title"),resultSet.getString("description"),resultSet.getString("release_year"),
                        resultSet.getString(21),resultSet.getInt("length"),resultSet.getString("special_features"),resultSet.getString("rating"),resultSet.getString(18));
                filmObjectArrayList.add(object);
            }
        }catch (SQLException e){

        }
        return filmObjectArrayList;

    }

    public ArrayList<ActorObject> getActors(int filmID){
        ArrayList<ActorObject> actorObjectsArray = new ArrayList<>();
        try {

//            preparedStatement = connection.prepareStatement("select a.first_name,a.last_name , a.actor_id\n" +
//                    "from film f \n" +
//                    "inner join film_actor fa on f.film_id = fa.film_id\n" +
//                    "inner join actor a on fa.actor_id=a.actor_id\n" +
//                    "where f.film_id = ?;");

            preparedStatement = JDBCConnector.getInstance().createStatement("select a.first_name,a.last_name , a.actor_id\n" +
                    "from film f \n" +
                    "inner join film_actor fa on f.film_id = fa.film_id\n" +
                    "inner join actor a on fa.actor_id=a.actor_id\n" +
                    "where f.film_id = ?;");
            preparedStatement.setInt(1,filmID);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ActorObject abc = new ActorObject( resultSet.getInt("actor_id") ,resultSet.getString("first_name"),resultSet.getString("last_name"));
                actorObjectsArray.add(abc);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return actorObjectsArray;
    }

}

/**
 * @author Christian
 */