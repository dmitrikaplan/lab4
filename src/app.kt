import Battle.*
import Cars.*
import Messeges.*
import Objects.*
import Persons.*

fun main(){
        val someone = object : Persons.Person(){
                override val name : String = "Он";

                init{println("$name присоединился к истории"); }

                fun displayGet(obj : Objects, obj2 : Objects){ println("$name достал ${obj.name} и положил их на ${obj2.name}"); }

        }
        val action : Messeges.Actions = Messeges.Actions();
        val talks: Messeges.Talks = Messeges.Talks();
        val tongue: Tongue = Tongue("язычок");
        //val tongue = createObject("Язычок");
        val santiks : Santiks = Santiks("5 сантиков");

        action.Grumble();
        someone.displayGet(santiks, tongue);
        val TV = createObject("Телевизор")
        santiks.displayEvent(TV);

        val screen: Screen = Screen("Экран");
        screen.light();
        talks.Film();

        val leader: Bandits = Bandits("Leader");
        val bandit1: Bandits = Bandits("Bandit1");
        val bandit2: Bandits = Bandits("Bandit2");

        val policeman: Police = Police("Policeman1");
        val policeman2: Police = Police("Policeman2");
        val policeman3: Police = Police("Policeman3");

        val detective : Detectives = Detectives("detective");
        val detective2 : Detectives = Detectives("detective2");

        val jewelry = createObject("драгоценности");
        val steal : Steal = Steal(leader, bandit1,  bandit2, jewelry);
        steal.displayEvent()

        val catch : Catch = Catch(policeman.getClass(), detective.getClass(), bandit1.getClass())
        catch.displayEvent()
        action.policeAcivity(policeman.getClass());
        action.banditsDeception(bandit1.getClass(), policeman.getClass());

        val dunno : Dunno = Dunno("Незнайка");
        val goat : Goat = Goat("Козлик");
        val watchfilm : WatchFilm =  WatchFilm(dunno, goat);
        watchfilm.displayEvent();

        talks.Pictures();
        val devytka: BanditsCar = BanditsCar(TypeOfCar.VAZ);
        val solaris: PoliceCar = PoliceCar(TypeOfCar.Hyundai);

        action.Shootout();
        val shootout: Shootout = Shootout(leader, bandit1, bandit2, policeman, policeman2, policeman3);
        shootout.displayEvent();

        devytka.exitCar();
        solaris.exitCar();
        action.Fight();
        val fight: Fight = Fight(leader, bandit1, bandit2, policeman, policeman2, policeman3);

        try {
                fight.displayEvent();
        }
        catch(e : Exception){

                println("Бандиты и полицейские решели не драться, потому что бой получиться нечестным");

        }

        policeman.Grab(leader);
        val samsung: TV = TV("Samsung");

        tongue.displayEvent();
        val title: Title = Title();

        screen.displayEvent()
        val help: Help = Help(bandit1, bandit2, leader);
        help.displayEvent();

        val bomb: PolicesBombs = PolicesBombs();
        bomb.displayEvent();

        val callhelp: CallHelp = CallHelp(TypeOfCar.TIGR, TypeOfCar.URAL);
        callhelp.displayEvent();

        val mercedes: BanditsCar = BanditsCar(TypeOfCar.MERCEDES);
        val bmw: PoliceCar = PoliceCar(TypeOfCar.BMW);
        action.Destroy();

        val fail : Fail = Fail(dunno, goat);
        fail.displayEvent();
        talks.tonguOut(tongue);
        goat.say();

        talks.washUp();
        goat.washUp();


        val pay : GoatPay = GoatPay(goat, 2);
        pay.displayEvent();

        try {
                pay.Transacton().pay(1, 1, 1);
        }
        catch(e : Exception){

                println("Козлик не смог умыться, потому что ему не хватило сантиков");

        }

    }