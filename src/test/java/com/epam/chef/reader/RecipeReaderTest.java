package com.epam.chef.reader;

public class RecipeReaderTest {
    private RecipeReader recipeReader;

}
//    public List<String> readAllLines(final String filePath) throws InaccessibleFileException {
//        List<String> recipeContent = null;
//        TxtFilePathValidator txtFilePathValidator = new TxtFilePathValidator();
//        if(!txtFilePathValidator.isCorrect(filePath)) {
//            throw new InaccessibleFileException("File path <" + filePath + "> is incorrect.");
//        }
//        if(Files.notExists(Paths.get(filePath))) {
//            throw new InaccessibleFileException("File <" + filePath + "> does not exist.");
//        }
//        if(!Files.isReadable(Paths.get(filePath))) {
//            throw new InaccessibleFileException("Reading of file <" + filePath + "> is not allowed.");
//        }
//        try {
//            recipeContent = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
//        } catch (IOException e) {
//            log.error(e.getMessage());
//        }
//        return recipeContent;
//    }