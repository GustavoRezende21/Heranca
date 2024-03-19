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
 * @brief Class Onibus
 */

public class Onibus extends Veiculo {

    int assentos; // Variável para armazenar o número de assentos do ônibus

    // Construtor padrão da classe Onibus
    public Onibus() {

    }

    // Construtor parametrizado da classe Onibus que recebe a placa, o ano e o número de assentos
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano); // Chama o construtor da superclasse (Veiculo) para inicializar a placa e o ano
        this.assentos = assentos; // Inicializa o número de assentos
    }

    // Método getter para obter o número de assentos
    public int getAssentos() {
        return assentos;
    }

    // Método setter para definir o número de assentos
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    // Método toString() sobrescrito para retornar uma representação em string do objeto ônibus
    public String toString() {
        return "Onibus [placa= " + super.getPlaca() + ", ano= " + super.getAno() + ", assentos= " + assentos + "]";
    }

}
