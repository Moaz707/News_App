package com.muaadh_melhi_nycdeveloper.myapplication.model;

import java.util.ArrayList;

/**
 * Created by rapier pc on 1/12/2018.
 */

public class News {

        private String status;

        public String getStatus() { return this.status; }

        public void setStatus(String status) { this.status = status; }

        private ArrayList<Source> sources;

        public ArrayList<Source> getSources() { return this.sources; }

        public void setSources(ArrayList<Source> sources) { this.sources = sources; }
    }