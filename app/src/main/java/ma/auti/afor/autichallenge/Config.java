package ma.auti.afor.autichallenge;

/**
 * Created by DELL on 12/01/2018.
 */

public class Config {

    //Addresse de notre CRUD
    public static final String URL_ADD="http://localhost:8080/EmpPHP/add.php";
    public static final String URL_GET_ALL = "http://localhost:8080/4Challenge/getAll.php";
    public static final String URL_GET_EMP = "http://localhost:8080/4Challenge/get.php?id=";
    public static final String URL_UPDATE_EMP = "http://localhost:8080/4Challenge/update.php";
    public static final String URL_DELETE_EMP = "http://localhost:8080/4Challenge/delete.php?id=";

    //Clés qui seront utilisées pour envoyer la requête aux scripts php
    public static final String KEY_Enf_ID = "id";
    public static final String KEY_Enf_NAME = "nom";
    public static final String KEY_Enf_AGE = "age";
    public static final String KEY_Enf_PHOTO = "photo";
    public static final String KEY_Enf_ETAT = "etat";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID_Enf = "id";
    public static final String TAG_Nom_Enf = "nom";
    public static final String TAG_Age = "age";
    public static final String TAG_photo = "photo";
    public static final String TAG_ID = "etat";


    //Enfant id
    public static final String Enf_ID = "Enf_id";
}
