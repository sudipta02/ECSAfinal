package com.Sudipta.android.ecsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sudipta on 13-07-2016.
 */
public class dataProviderOfStudentCouncil {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> MoviesDetails = new HashMap<>();

        List<String> VP = new ArrayList<>();
        VP.add("SHAILESH KUMAR VERMA");

        List<String> GS = new ArrayList<>();
        GS.add("TARINI SINGH");


        List<String> JS= new ArrayList<>();
        JS.add("ANKESH KUMAR SINGH");
        JS.add("SHADAAB AHMED");


        List<String> FS = new ArrayList<>();
        FS.add("SUBHASHREE DUTTA CHOUDHURY");
        FS.add("ROHAN SINGH");

        List<String> TS = new ArrayList<>();
        TS.add("PRADUMN KUMAR");
        TS.add("KANIGIRI VISVANATH");
        TS.add("ABHISHEK DUTTA");
        TS.add("SIDHANT MAHARISHI");

        List<String> CS = new ArrayList<>();
        CS.add("SABYASACHI CHOUDHURY");
        CS.add("PRAGYA SHEKHAR");
        CS.add("ARADHANA BARUAH");

        List<String> SS = new ArrayList<>();
        SS.add("SAGARIKA");
        SS.add("PRATIK CHETTRI");

        List<String> LS = new ArrayList<>();
        LS.add("ABHIROOP BOSE");
        LS.add("PAMOLI NATH");

        List<String> MSS = new ArrayList<>();
        MSS.add("RAHUL KUMAR PRASAD");
        MSS.add("SHIVJI PRASAD");

        List<String> EMS = new ArrayList<>();
        EMS.add("RISHANSHI VERMA");
        EMS.add("VINEET JAIN");
        EMS.add("SAMA KAVYA SHREE REDDY");
        EMS.add("PUSHPAK NANDY");
        EMS.add("UTKARSH");
        EMS.add("KRISHANGI DEKA");
        EMS.add("ARKA DEEP SUR");

        List<String> LBS = new ArrayList<>();
        LBS.add("MANISHA DAS");
        LBS.add("JAI KRISHNA KN");



        MoviesDetails.put("Vice President", VP);
        MoviesDetails.put("General Secretary", GS);
        MoviesDetails.put("Joint Secretary", JS);
        MoviesDetails.put("Finance Secretary", FS);
        MoviesDetails.put("Technical Secretary", TS);
        MoviesDetails.put("Cultural Secretary", CS);
        MoviesDetails.put("Sports Secretary", SS);
        MoviesDetails.put("Literary Secretary", LS);
        MoviesDetails.put("Media & Sponsor Secretary", MSS);
        MoviesDetails.put("Event Management Secretary", EMS);
        MoviesDetails.put("Library Secretary", LBS);

        return MoviesDetails;

    }

}
