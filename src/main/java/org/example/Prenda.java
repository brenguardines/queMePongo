package org.example;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Trama trama;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama,  Color colorPrimario, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario; //con color secundario
  }

  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario; //sin color secundario
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Trama getTrama(){
    if(trama == null){
      return Trama.LISA;
    }
    return trama;
  }
}
