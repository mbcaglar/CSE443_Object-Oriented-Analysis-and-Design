/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEDO
 */
public abstract class Suits {
    String description = "Unknown Suits";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
    public abstract double weight();
}
