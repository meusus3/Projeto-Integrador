package meusus;

public class MeuSus {

    public static void main(String[] args) {
        Paciente psc = new Paciente();
        psc.nome = "Ana";
        psc.cpf = 000000000;
        psc.datanasc = "20/01/1994";
        psc.sexo = "Feminino";
        psc.endpac = 00000000;
        psc.email = "ana@gmail.com";
        psc.celular = 000000000;
        psc.status();
        
        Agendamento agen = new Agendamento();
        agen.hospital = "Hospital Regional";
        agen.data = "20/11/2021";
        agen.horário = "11:00";
        agen.status();
        
        Detalhes_Agendamento detAgen = new Detalhes_Agendamento();
        detAgen.exame = "Teste  de COVID19";
        detAgen.status();
        
        Consulta cons = new Consulta();
        cons.idConsulta = "se tem Consulta";
        cons.status();
    }

}
