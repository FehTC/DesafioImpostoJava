package Mod3;

import java.util.Locale;
import java.util.Scanner;

public class MOD3_DesafioImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = 0;
		double salarioMes=0;
		double impostoSalario=0;
						
		double prestacaoServico=0;
		double impostoPrestacaoServico=0;
		
		double ganhoCapital=0;
		double impostoGanhoCapital=0;
		
		double gastosMedico=0;
		double gastosEducacionais=0;
		double maxDedutivel =0;
		double gastosDedutivel =0;
		
		double impostoBrutoTotal=0;
		double abatimento =0;
		double impostoDevido =0;
		
		System.out.print("Renda anual com salário:");
		salario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço:");
		prestacaoServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital:");
		ganhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos:");
		gastosMedico = sc.nextDouble();
		System.out.print("Gastos educacionais:");
		gastosEducacionais = sc.nextDouble();
		
		System.out.println();
		
		salarioMes = salario/12;
		
		if (salarioMes>= 3000 && salarioMes<=5000) {
			impostoSalario = (salario * 0.1);
		}
		else if (salarioMes>=5000) {
			impostoSalario = (salario * 0.2);
		}
		
		if (prestacaoServico != 0 && prestacaoServico>0) {
			impostoPrestacaoServico =  (prestacaoServico*0.15);
		}
		
		if (ganhoCapital != 0 && ganhoCapital>0) {
			impostoGanhoCapital =  (ganhoCapital*0.2);
		}
		
		maxDedutivel = (impostoSalario+impostoPrestacaoServico+impostoGanhoCapital)*0.3;
		gastosDedutivel = gastosMedico + gastosEducacionais;
			
		impostoBrutoTotal = impostoSalario+impostoPrestacaoServico+impostoGanhoCapital;
		
		if (gastosDedutivel< maxDedutivel) {
			abatimento = gastosDedutivel;
		}
		else {
			abatimento = maxDedutivel;
		}
		
		impostoDevido = impostoBrutoTotal-abatimento;
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n",impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f\n",impostoPrestacaoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n",impostoGanhoCapital);
		
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível:%.2f\n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f\n",gastosDedutivel);
		
		System.out.println();
		System.out.println("Resumo:");
		System.out.printf("Imposto bruto total::%.2f\n", impostoBrutoTotal);
		System.out.printf("Abatimento: %.2f\n",abatimento);
		System.out.printf("Imposto devido: %.2f\n",impostoDevido);
						
		sc.close();
	}

}
