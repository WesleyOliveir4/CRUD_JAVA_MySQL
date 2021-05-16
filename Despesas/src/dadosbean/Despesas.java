/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosbean;

/**
 *
 * @author wesley
 */
public class Despesas {
    
    int Id;
    String Item;
    float Valor;

    public Despesas(int Id, String Item, float Valor) {
        this.Id = Id;
        this.Item = Item;
        this.Valor = Valor;
    }

    public Despesas(String Item, float Valor) {
        this.Item = Item;
        this.Valor = Valor;
    }

    public Despesas(int Id) {
        this.Id = Id;
    }
    

    public int getId() {
        return Id;
    }

    public String getItem() {
        return Item;
    }

    public float getValor() {
        return Valor;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
      @Override
    public String toString() {
        return "Despesas{" + "Id=" + Id + ", Item=" + Item + ", Valor=" + Valor + '}';
    }
    
}
