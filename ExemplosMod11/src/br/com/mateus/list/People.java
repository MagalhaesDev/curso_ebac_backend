package br.com.mateus.list;

public class People {
    private String name;
    private String sexo;

    public People() {

    }

    public People(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    @Override
    public int hashCode() {
        return name.hashCode() + sexo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        People pessoa = (People) obj;
        return name.equals(pessoa.name) && sexo.equals(pessoa.name);
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Sexo: " + sexo;
    }
}
