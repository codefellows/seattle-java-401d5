using Graphs.Classes;
using System;

namespace Graphs
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            GraphExample();
        }

        static void GraphExample()
        {
            Graph<string> graph = new Graph<string>();

            Vertex<string> a = graph.AddNode("Washington");
            Vertex<string> b = graph.AddNode("Montana");
            Vertex<string> c = graph.AddNode("North Dakota");


            graph.AddUnDirectedEdge(a, b, 10);
            graph.AddUnDirectedEdge(b, c, 5);
            graph.AddUnDirectedEdge(c, a, 20);


            graph.Print();

            Console.WriteLine("=== Just Washington ====");

            var vertex = graph.GetVertex("Washington");
            var neighbors = graph.GetNeighbors(vertex);
            Console.Write($"{vertex.Value}:");
      
            foreach (var item in neighbors)
            {
                Console.Write($"{item.Vertex.Value}, {item.Weight} => ");
            }


            Console.WriteLine($"Our Graph has {graph.Size()} vertices");
            var listOfVer = graph.GetAllVertices();
            int count = 0;
            foreach (var item in listOfVer)
            {
                count++;
                Console.WriteLine($"{count}){item.Value}");
            }
        }
    }
}
