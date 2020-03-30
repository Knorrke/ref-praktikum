package listeOhneKompositum;

/**
 * Knoten der rekursiven Listenstruktur ohne Kompositum,
 * hat 0 oder 1 Nachfolgerknoten und ein Datenelement.
 */
class KNOTEN
{
    KNOTEN nachfolger;
    DATENELEMENT daten;

    //Konstruktoren
    KNOTEN()
    {
        nachfolger = null;
        daten = null;
    }

    KNOTEN(KNOTEN neuerNachfolger, DATENELEMENT neueDaten)
    {
        nachfolger = neuerNachfolger;
        daten = neueDaten;
    }

    //Setter
    public void nachfolgerSetzen (KNOTEN neuerNachfolger)
    {
        nachfolger = neuerNachfolger;
        return;
    }

    public void datenSetzen (DATENELEMENT neueDaten)
    {
        daten = neueDaten;
        return;
    }

    //Getter
    public KNOTEN nachfolgerGeben()
    {
        return nachfolger;
    }

    public DATENELEMENT datenGeben()
    {
        return daten;
    }

    //anzahlGeben

    //amEndeEinfügen

    //letztesElementLöschen

}
