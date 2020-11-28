package com.h2prop.blueno_ble.Weather;


import java.util.List;

public class WeatherResponse {


    private int cod;
    private String name;
    private int id;
    private int timezone;
    private Sys sys;
    private int dt;
    private Clouds clouds;
    private Wind wind;
    private Main main;
    private String base;
    private List<Weather> weather;
    private Coord coord;

    public static class Sys {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("sunset")
        private int sunset;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("sunrise")
        private int sunrise;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("country")
        private String country;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("message")
        private double message;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("id")
        private int id;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("type")
        private int type;

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public double getMessage() {
            return message;
        }

        public void setMessage(double message) {
            this.message = message;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    public static class Clouds {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("all")
        private int all;

        public int getAll() {
            return all;
        }

        public void setAll(int all) {
            this.all = all;
        }
    }

    public static class Wind {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("deg")
        private double deg;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("speed")
        private double speed;

        public double getDeg() {
            return deg;
        }

        public void setDeg(double deg) {
            this.deg = deg;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
    }

    public static class Main {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("humidity")
        private int humidity;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("pressure")
        private int pressure;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("temp_max")
        private double temp_max;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("temp_min")
        private double temp_min;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("feels_like")
        private double feels_like;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("temp")
        private double temp;

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public double getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(double temp_max) {
            this.temp_max = temp_max;
        }

        public double getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(double temp_min) {
            this.temp_min = temp_min;
        }

        public double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(double feels_like) {
            this.feels_like = feels_like;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }
    }

    public static class Weather {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("icon")
        private String icon;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("description")
        private String description;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("main")
        private String main;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("id")
        private int id;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class Coord {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("lat")
        private double lat;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("lon")
        private double lon;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }


}
