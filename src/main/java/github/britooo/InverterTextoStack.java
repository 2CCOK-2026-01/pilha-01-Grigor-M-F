package github.britooo;

import java.util.Stack;

public class InverterTextoStack {
    public static String inverter(String input) {
        Stack<Character> pilha = new Stack<>();

        for (char c : input.toCharArray()) {
            pilha.push(c);
        }

        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }
}
