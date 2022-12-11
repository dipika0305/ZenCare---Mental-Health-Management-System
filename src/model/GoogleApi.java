/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.jfree.data.json.impl.JSONArray;
import org.jfree.data.json.impl.JSONObject;

/**
 *
 * @author Mitali
 */
public class GoogleApi {
//    public ArrayList<String> getCities() {
//        ArrayList<String> cities = new ArrayList<>();
//        try {
//            // create URL for Open Cage Geocode API
//            String url = "https://countriesnow.space/api/v0.1/countries/capital";
//
//           HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//            connection.setRequestMethod("GET");
//
//           // read response from API
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//
//           // parse JSON response
//            JSONObject json = new JSONObject(response.toString());
//            JSONArray results = json.getJSONArray("data");
//
//           // print list of all country capitals
//            for (int i = 0; i < results.length(); i++) {
//                JSONObject result = results.getJSONObject(i);
//                cities.add(result.getString("capital"));
////                System.out.println(country + ": " + capital);
//            }
//        } catch (IOException | JSONException e) {
//        }
//
//       return cities;
//    }


}
