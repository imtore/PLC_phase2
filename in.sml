class​ ​MainClass​{
    def ​main​(): ​int​ {
    return​ ​0​;
    }
}
class​ ​Test1​{
    var​ i: ​int​;
    def ​salam​(): ​string​{
        return​ ​"salam"​;
    }

    def ​testMethod​(): ​int​{
        this​.i = ​10;​ ​# e​rror
        i = ​10​; ​#​ correct
        writeln(​this​.salam()); ​# ​ok
        return​ ​0​;
    }
}