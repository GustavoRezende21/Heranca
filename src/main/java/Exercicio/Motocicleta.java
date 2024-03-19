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
 * @brief Class Motocicleta
 */

public class Motocicleta extends Veiculo {

    int cilindradas; // Variável para armazenar as cilindradas da motocicleta

    public Motocicleta() {
    }

    // Construtor parametrizado para inicializar as cilindradas, placa e ano da motocicleta
    public Motocicleta(int cilindradas, String placa, int ano) {
        super(placa, ano);
        this.cilindradas = cilindradas;
    }

    // Getter para obter as cilindradas da motocicleta
    public int getCilindradas() {
        return cilindradas;
    }

    // Setter para definir as cilindradas da motocicleta
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Sobrescrita do método toString para retornar uma representação em string da motocicleta
    public String toString() {
        return "Motocicleta [placa= " + super.getPlaca() + ", ano= " + super.getAno() + ", cilindradas= " + cilindradas + "]";
    }
}
