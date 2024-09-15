import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import aed3.Registro;

public class Tarefa implements Registro {

    int id;
    String nome;
    LocalDate dataCriacao;
    LocalDate dataConclusao;
    byte status; // 0 - Pendente, 1 - Em Progresso, 2 - Concluída
    byte prioridade; // 0 - Baixa, 1 - Média, 2 - Alta

    public Tarefa() {
        this(-1, "", LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), (byte)1, (byte)2);
    }

    public Tarefa (String nome, LocalDate dataCriacao, LocalDate dataConclusao, byte status, byte prioridade) {
        this(-1, nome, dataCriacao, dataConclusao, status, prioridade);
        
    }

    public Tarefa(int id, String nome, LocalDate dataCriacao, LocalDate dataConclusao, byte status, byte prioridade) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.prioridade = prioridade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public byte[] toByteArray() throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(this.id);
        dos.writeUTF(this.nome);
        dos.writeInt((int)this.dataCriacao.toEpochDay());
        dos.writeInt((int)this.dataConclusao.toEpochDay());
        dos.writeByte(this.status);
        dos.writeByte(this.prioridade);

        return baos.toByteArray();
    }

    public void fromByteArray(byte[] b) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        DataInputStream dis = new DataInputStream(bais);
        this.id = dis.readInt();
        this.nome = dis.readUTF();
        this.dataCriacao = LocalDate.ofEpochDay(dis.readInt());
        this.dataConclusao = LocalDate.ofEpochDay(dis.readInt());
        this.status = dis.readByte();
        this.prioridade = dis.readByte();
    }

    public String toString() {
        return "\nID:..............: " + this.id + 
             "\nNome:............: " + this.nome + 
             "\nData de Criação..: " + this.dataCriacao + 
             "\nData de Conclusão: " + this.dataConclusao + 
             "\nStatus...........: " + this.status + 
             "\nPrioridade.......: " + this.prioridade;
    }

    public int compareTo(Object p) {
        return this.id - ((Tarefa)p).id;
    }

}
