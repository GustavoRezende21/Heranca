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
 * @brief Class Caminhao
 */

public class Caminhao extends Veiculo {

    int eixos;

    // Construtor padrão da classe Caminhao
    public Caminhao() {
    }

    // Construtor parametrizado da classe Caminhao que recebe a placa, o ano e o número de eixos
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano); // Chama o construtor da superclasse (Veiculo) para inicializar a placa e o ano
        this.eixos = eixos; // Inicializa o número de eixos
    }

    // Método getter para obter o número de eixos
    public int getEixos() {
        return eixos;
    }

    // Método setter para definir o número de eixos
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    // Método toString() sobrescrito para retornar uma representação em string do objeto Caminhao
    public String toString() {
        return "Caminhão [placa= " + super.getPlaca() + ", ano= " + super.getAno() + ", eixos= " + eixos + "]";
        
    }
}
