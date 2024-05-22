package com.microsoft.ghcpdemo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SWAPIImpl implements SWAPI {

    public Person getLukeSkywalker() throws IOException, InterruptedException {

        return getPerson(1);

    }

    // generic method to get a person from the Star Wars API via id
    public Person getPerson(int id) throws IOException, InterruptedException {

        // create http client and request swapi.info for the person
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.info/api/people/" + id + "/"))
                .build();

        // send the request and parse the response into a Person object
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(response.body());

        Person person = mapper.readValue(response.body(), Person.class);
        return person;

    }

    // add more methods to get other people from the Star Wars API if needed and
    // implemeent interface

    public Person getC3PO() throws IOException, InterruptedException {
        return getPerson(2);
    }

    public Person getR2D2() throws IOException, InterruptedException {
        return getPerson(3);
    }

    public Person getDarthVader() throws IOException, InterruptedException {
        return getPerson(4);
    }

    public Person getLeiaOrgana() throws IOException, InterruptedException {
        return getPerson(5);
    }

    public Person getOwenLars() throws IOException, InterruptedException {
        return getPerson(6);
    }

    public Person getBeruWhitesunLars() throws IOException, InterruptedException {
        return getPerson(7);
    }

    public Person getR5D4() throws IOException, InterruptedException {
        return getPerson(8);
    }

    public Person getBiggsDarklighter() throws IOException, InterruptedException {
        return getPerson(9);
    }

    public Person getObiWanKenobi() throws IOException, InterruptedException {
        return getPerson(10);
    }

    public Person getAnakinSkywalker() throws IOException, InterruptedException {
        return getPerson(11);
    }

    public Person getWilhuffTarkin() throws IOException, InterruptedException {
        return getPerson(12);
    }

    public Person getChewbacca() throws IOException, InterruptedException {
        return getPerson(13);
    }

    public Person getHanSolo() throws IOException, InterruptedException {
        return getPerson(14);
    }

    public Person getGreedo() throws IOException, InterruptedException {
        return getPerson(15);
    }

    public Person getJabbaDesilijicTiure() throws IOException, InterruptedException {
        return getPerson(16);
    }

    public Person getWedgeAntilles() throws IOException, InterruptedException {
        return getPerson(18);
    }

    public Person getJekTonoPorkins() throws IOException, InterruptedException {
        return getPerson(19);
    }

    public Person getYoda() throws IOException, InterruptedException {
        return getPerson(20);
    }

    public Person getPalpatine() throws IOException, InterruptedException {
        return getPerson(21);
    }

    public Person getBobaFett() throws IOException, InterruptedException {
        return getPerson(22);
    }

    public Person getIG88() throws IOException, InterruptedException {
        return getPerson(23);
    }

    public Person getBossk() throws IOException, InterruptedException {
        return getPerson(24);
    }

    public Person getLandoCalrissian() throws IOException, InterruptedException {
        return getPerson(25);
    }

    public Person getLobot() throws IOException, InterruptedException {
        return getPerson(26);
    }

    public Person getAckbar() throws IOException, InterruptedException {
        return getPerson(27);
    }

    public Person getMonMothma() throws IOException, InterruptedException {
        return getPerson(28);
    }

    public Person getArvelCrynyd() throws IOException, InterruptedException {
        return getPerson(29);
    }

    public Person getWicketSystriWarrick() throws IOException, InterruptedException {
        return getPerson(30);
    }

    public Person getNienNunb() throws IOException, InterruptedException {
        return getPerson(31);
    }

    public Person getQuiGonJinn() throws IOException, InterruptedException {
        return getPerson(32);
    }

    public Person getNuteGunray() throws IOException, InterruptedException {
        return getPerson(33);
    }

    public Person getFinisValorum() throws IOException, InterruptedException {
        return getPerson(34);
    }

    public Person getPadméAmidala() throws IOException, InterruptedException {
        return getPerson(35);
    }

    public Person getJarJarBinks() throws IOException, InterruptedException {
        return getPerson(36);
    }

    public Person getRoosTarpals() throws IOException, InterruptedException {
        return getPerson(37);
    }

    public Person getRugorNass() throws IOException, InterruptedException {
        return getPerson(38);
    }

    public Person getRicOlié() throws IOException, InterruptedException {
        return getPerson(39);
    }

    public Person getWatto() throws IOException, InterruptedException {
        return getPerson(40);
    }

    public Person getSebulba() throws IOException, InterruptedException {
        return getPerson(41);
    }

    public Person getQuarshPanaka() throws IOException, InterruptedException {
        return getPerson(42);
    }

    public Person getShmiSkywalker() throws IOException, InterruptedException {
        return getPerson(43);
    }

    public Person getDarthMaul() throws IOException, InterruptedException {
        return getPerson(44);
    }

    public Person getBibFortuna() throws IOException, InterruptedException {
        return getPerson(45);
    }

    public Person getAylaSecura() throws IOException, InterruptedException {
        return getPerson(46);
    }

    public Person getRattsTyerel() throws IOException, InterruptedException {
        return getPerson(47);
    }

    public Person getDudBolt() throws IOException, InterruptedException {
        return getPerson(48);
    }

    public Person getGasgano() throws IOException, InterruptedException {
        return getPerson(49);
    }

    public Person getBenQuadinaros() throws IOException, InterruptedException {
        return getPerson(50);
    }

    public Person getMaceWindu() throws IOException, InterruptedException {
        return getPerson(51);
    }

    public Person getKiAdiMundi() throws IOException, InterruptedException {
        return getPerson(52);
    }

    public Person getKitFisto() throws IOException, InterruptedException {
        return getPerson(53);
    }

    public Person getEethKoth() throws IOException, InterruptedException {
        return getPerson(54);
    }

    public Person getAdiGallia() throws IOException, InterruptedException {
        return getPerson(55);
    }

    public Person getSaeseeTiin() throws IOException, InterruptedException {
        return getPerson(56);
    }

    public Person getYaraelPoof() throws IOException, InterruptedException {
        return getPerson(57);
    }

    public Person getPloKoon() throws IOException, InterruptedException {
        return getPerson(58);
    }

    public Person getMasAmedda() throws IOException, InterruptedException {
        return getPerson(59);
    }

    public Person getGregarTypho() throws IOException, InterruptedException {
        return getPerson(60);
    }

    public Person getCordé() throws IOException, InterruptedException {
        return getPerson(61);
    }

    public Person getClieggLars() throws IOException, InterruptedException {
        return getPerson(62);
    }

    public Person getPoggleTheLesser() throws IOException, InterruptedException {
        return getPerson(63);
    }

    public Person getLuminaraUnduli() throws IOException, InterruptedException {
        return getPerson(64);
    }

    public Person getBarrissOffee() throws IOException, InterruptedException {
        return getPerson(65);
    }

    public Person getDormé() throws IOException, InterruptedException {
        return getPerson(66);
    }

    public Person getDooku() throws IOException, InterruptedException {
        return getPerson(67);
    }

    public Person getBailPrestorOrgana() throws IOException, InterruptedException {
        return getPerson(68);
    }

    public Person getJangoFett() throws IOException, InterruptedException {
        return getPerson(69);
    }

    public Person getZamWesell() throws IOException, InterruptedException {
        return getPerson(70);
    }

    public Person getDexterJettster() throws IOException, InterruptedException {
        return getPerson(71);
    }

    public Person getLamaSu() throws IOException, InterruptedException {
        return getPerson(72);
    }

    public Person getTaunWe() throws IOException, InterruptedException {
        return getPerson(73);
    }

    public Person getJocastaNu() throws IOException, InterruptedException {
        return getPerson(74);
    }

    public Person getR4P17() throws IOException, InterruptedException {
        return getPerson(75);
    }

    public Person getWatTambor() throws IOException, InterruptedException {
        return getPerson(76);
    }

    public Person getSanHill() throws IOException, InterruptedException {
        return getPerson(77);
    }

    public Person getShaakTi() throws IOException, InterruptedException {
        return getPerson(78);
    }

    public Person getGrievous() throws IOException, InterruptedException {
        return getPerson(79);
    }

    public Person getTarfful() throws IOException, InterruptedException {
        return getPerson(80);
    }

    public Person getRaymusAntilles() throws IOException, InterruptedException {
        return getPerson(81);
    }

    public Person getSlyMoore() throws IOException, InterruptedException {
        return getPerson(82);
    }

    public Person getTionMedon() throws IOException, InterruptedException {
        return getPerson(83);
    }

}
