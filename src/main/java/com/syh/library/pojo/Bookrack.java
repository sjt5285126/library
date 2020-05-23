package com.syh.library.pojo;

public class Bookrack {
    private String rack_id;
    private String rack_type;

    public String getRack_id() {
        return rack_id;
    }

    public void setRack_id(String rack_id) {
        this.rack_id = rack_id;
    }

    @Override
    public String toString() {
        return "Bookrack{" +
                "rack_id='" + rack_id + '\'' +
                ", rack_type='" + rack_type + '\'' +
                '}';
    }

    public String getRack_type() {
        return rack_type;
    }

    public void setRack_type(String rack_type) {
        this.rack_type = rack_type;
    }
}
