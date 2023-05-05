package it.devlec.json;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class EsempioJSON {
    private static final Logger logger = LogManager.getLogger(EsempioJSON.class);

    public void esempioJSONOggetto(){
        JSONObject jo = new JSONObject();
        jo.put("nome", "Giovanni");
        jo.put("eta", "22");
        jo.put("citta", "Lecce");
        logger.info("JSON "+ jo);

        JSONObject je = new JSONObject();
        je.put("nome", "Saverio");
        je.put("eta", "22");
        je.put("citta", "Bari");


        JSONObject ji = new JSONObject();
        ji.put("nome", "Luca");
        ji.put("eta", "34");
        ji.put("citta", "Bitonto");
        logger.info("JSON "+ jo + "\n" + je + "\n" + ji);

    }
    public void esempioJSONArray(){
        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("Ciao a tutti");

        JSONObject jo = new JSONObject();
        jo.put("Nome", "Luca");
        jo.put("eta", "67");
        jo.put("citta", "Roma");


        JSONObject je = new JSONObject();
        je.put("nome", "Saverio");
        je.put("eta", "22");
        je.put("citta", "Bari");


        JSONObject ji = new JSONObject();
        ji.put("nome", "Luca");
        ji.put("eta", "34");
        ji.put("citta", "Bitonto");
        logger.info("JSON "+ jo + "\n" + je + "\n" + ji);

        ja.put(jo);
        //logger.info("JSON "+ ja);

        ja.put(je);
        //logger.info("JSON "+ je);

        ja.put(ji);
        logger.info("JSON "+ ja);

    }
}
