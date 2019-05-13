
public class Empleado
{
    private String nombre,apellido,genero;   
    private Double fechaNac,fechaIng,salario;
    
    public Empleado(String nombre,String apellido,String genero,Double fechaNac,Double fechaIng,Double salario)
    {
       this.nombre=nombre;
       this.apellido=apellido;
       this.genero=genero;
       this.fechaNac=fechaNac;
       this.fechaIng=fechaIng;
       this.salario=salario;
    }
    public String getNombre(){
     return nombre;
    }
    public String getApellido(){
     return apellido;
    }
    public String getGenero(){
     return genero;
    }
    public Double getFechaNac(){
     return fechaNac;
    }
    public Double getFechaIng(){
     return fechaIng;
    }
    public Double getSalario(){
     return salario;
    }
    public void setNombre(String nombre){
     this.nombre=nombre;
    }
    public void setApellido(String apellido){
     this.apellido=apellido;
    }
    public void setGenero(String genero){
     this.genero=genero;
    }
    public void setFechaNac(Double fechaNac){
     this.fechaNac=fechaNac;
    }
    public void setFechaIng(Double fechaIng){
     this.fechaIng=fechaIng;
    }
    public void setSalario(Double salario){
     this.salario=salario;
    }
}
