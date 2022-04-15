package Messeges

import Objects.Tongue
import Persons.Goat

class Messeges {

    class Actions {

            fun Shootout(){

                println();
                println("Вдруг началась оглушительная перестрелка");
                println();

            }

            fun Fight(){

                println();
                println("Неожиданно началась драка");
                println();


            }

            fun Destroy(){

                println();
                println("Полицейские ломают и крушат все на своем пути");
                println();

            }

            fun policeAcivity(police : String){

                println("$police устраивает многочисленные облавы, засады и внезапные нападения")

            }
            fun Grumble(){

                print("Поворочав немного,")

            }

            fun banditsDeception(bandits : String, police : String){

                println("$bandits удалось ловко обмануть $police и уйти от преследования\n");

            }

            fun tonguOut(tongue : Tongue){

                println("Когда $tongue высунулся в 5 раз")

            }




    }

        class Talks{

            fun Pictures(){
                println();
                println("Картина между тем становилась все напряженнее и стреминельнее");
                println();
            }

            fun Film(){

                println("В фильме показывалось:\n")

            }

            fun tonguOut(tongue : Tongue){

                println("Когда $tongue высунулся в 5 раз")

            }

            fun washUp(){

                println("\nРешив на ночь умыться");

            }

    }
}