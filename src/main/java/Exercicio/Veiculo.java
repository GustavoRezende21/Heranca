/*
 * Copyright (C) 2024 Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Exercicio;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 19/03/2024
 * @brief Class Veiculo
 */

public abstract class Veiculo {

    // Declaração das variáveis de instância
    String placa;
    int ano;

    // Construtor padrão da classe Veiculo
    public Veiculo() {

    }

    // Construtor parametrizado da classe Veiculo
    public Veiculo(String placa, int ano) {
        super(); // Chamada ao construtor da superclasse (se existir)
        this.placa = placa; // Inicialização da variável placa com o valor passado como parâmetro
        this.ano = ano; // Inicialização da variável ano com o valor passado como parâmetro
    }

    // Método getter para obter o valor da placa
    public String getPlaca() {
        return placa; // Retorna o valor da placa
    }

    // Método setter para definir o valor da placa
    public void setPlaca(String placa) {
        this.placa = placa; // Define o valor da placa com o valor passado como parâmetro
    }

    // Método getter para obter o valor do ano
    public int getAno() {
        return ano; // Retorna o valor do ano
    }

    // Método setter para definir o valor do ano
    public void setAno(int ano) {
        this.ano = ano; // Define o valor do ano com o valor passado como parâmetro
    }

    // Sobrescrita do método toString para retornar uma representação em string do objeto Veiculo
    public String toString() {
        return "Veiculo [placa= " + placa + ", ano= " + ano + "]"; // Retorna uma string representando o objeto Veiculo
    }
}