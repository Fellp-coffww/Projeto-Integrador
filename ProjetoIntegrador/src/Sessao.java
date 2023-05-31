import java.time.*;

public class Sessao {
    


 private int data = 0;
 
 private Sala sala = new Sala();

 private Filme filme = new Filme();

 private int horario = 0; // Tempo em minutos para o inicio horário 

public void setSala(Sala sala) {
    this.sala = sala;
}

public void setFilme(Filme filme) {
    this.filme = filme;
}

public Sala getSala() {
    return sala;
}

public Filme getFilme() {
    return filme;
}

public int getData() {
    return data;
}

public int getHorario() {
    return horario;
}

public void setData(int data) {
    this.data = data;
}

public void setHorario(int horario) {
    this.horario = horario;
}


 
 



}
