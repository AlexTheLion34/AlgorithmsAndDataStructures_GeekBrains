/**
 * Java 2, Homework 7
 * @author Aleksey Petrenko
 * @version 3 August, 2018
 * @link https://github.com/AlexTheLion34
 */

public class Main {

    public static void main(String[] args) {
        Graph graph = new GraphImpl(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Липецк");
        graph.addVertex("Воронеж");
        graph.addVertex("Рязань");
        graph.addVertex("Тамбов");
        graph.addVertex("Саратов");
        graph.addVertex("Калуга");
        graph.addVertex("Орел");
        graph.addVertex("Курск");
        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва",  "Калуга");
        graph.addEdge("Москва",  "Рязань");
        graph.addEdge("Тула",  "Липецк");
        graph.addEdge("Липецк",  "Воронеж");
        graph.addEdge("Рязань",  "Тамбов");
        graph.addEdge("Тамбов",  "Саратов");
        graph.addEdge("Саратов",  "Воронеж");
        graph.addEdge("Калуга",  "Орел");
        graph.addEdge("Орел",  "Курск");
        graph.addEdge("Курск", "Воронеж");
        graph.bfs("Москва", "Курск");
        graph.bfs("Москва", "Воронеж");
        graph.bfs("Москва", "Саратов");
    }
}
