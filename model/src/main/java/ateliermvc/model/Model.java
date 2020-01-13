package ateliermvc.model;

import java.io.*;

public class Model implements IModel {
    @Override
    public String getMessage()  {
        String res = "";
        try(BufferedReader text = new BufferedReader(new InputStreamReader(Model.class.getResourceAsStream("message.txt")))){

            res = text.readLine();
            return res;
        }
        catch (Exception e){e.printStackTrace();}

        return res;
    }
}
