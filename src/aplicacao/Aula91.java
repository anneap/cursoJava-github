package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.NivelFuncionario;

public class Aula91 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Informe o nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Informe os dados do Funcionário: ");
		System.out.print("Nome: ");
		String nomeFuncionario = sc.nextLine();
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();

		Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivel), salarioBase,
				new Departamento(nomeDepartamento));
		System.out.println("Quantos contratos para este funcionário: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Informe os dados do contrato #" + i);
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por Hora: $");
			double valorHora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);

			funcionario.addContrato(contrato);

		}
		System.out.println();
		System.out.println("Digite mês e ano para calcular o rendimento (MM/AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0 , 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: "+ funcionario.getNome());
		System.out.println("Departamento: "+funcionario.getDepartamento().getNome());
		System.out.println("Rendimentos de "+ mesEAno+": "+String.format("%.2f", funcionario.renda(ano, mes)));
		
		
		

		sc.close();
	}

}
