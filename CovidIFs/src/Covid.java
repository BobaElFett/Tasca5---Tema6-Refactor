public class Covid {
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ) {
        if (bodyTemperature >= 38) {
            if (difficultyBreathing || diabetes || cancer || isPregnant || isOver60yearsold || hepatic || kidnevDisease || respiratoryDisease) {
                return "/diagnostico/" + provincia;
            } else {
                return "/cuarentena/";
            }
        }
        return "/diagnostico_bueno/";
    }
}