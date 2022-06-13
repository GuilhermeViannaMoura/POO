package l09ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author guivm
 */
public class ClienteArquivo {
    private File arquivo = new File("registroCliente.txt");
    
    public void cria_arquivo(){
        try{
            arquivo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void inserir(Cliente c){
        try{
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(c.getNome()+"/");
            bw.write(c.getCpf()+"/");
            bw.write(c.getEndereco());
            bw.newLine();
            bw.close();
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public Cliente buscaPorCPF(int cpf){
        Cliente c = null;
        String[] dados = null;
        try{
            FileReader fw = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fw);
            
            while(br.ready()){
                String linha = br.readLine();
                dados = linha.split("/"); // [nome,cpf,endereço]
                if (Integer.parseInt(dados[1]) == cpf){
                    c = new Cliente(dados[0],Integer.parseInt(dados[1]),dados[2]);
                    return c;
                }
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return c;
    }
    public Cliente buscaPorNome(String nome){
        Cliente c = null;
        String[] dados = null;
        try{
            FileReader fw = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fw);
            
            while(br.ready()){
                String linha = br.readLine();
                dados = linha.split("/"); // [nome,cpf,endereço]
                if (dados[0].equals(nome)){
                    c = new Cliente(dados[0],Integer.parseInt(dados[1]),dados[2]);
                    return c;
                }
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return c;
    }
    public void listar(){
        String[] dados = null;
        try{
            FileReader fw = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fw);
            System.out.println("Nome\tCPF\tEndereço");
            while(br.ready()){
                String linha = br.readLine();
                dados = linha.split("/"); // [nome,cpf,endereço]
                System.out.print(dados[0]+"\t");
                System.out.print(dados[1]+"\t");
                System.out.println(dados[2]+"\t");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void excluir(int cpf){ //////////////////////////////////////////
        // criar arquivo novo sem a linha que deve ser excluida
        // apagar o arquivo antigo e renomear o novo 
    }
}
