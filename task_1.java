@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("Возраст пользователя больше 18", expected, isAdult);// Напиши код здесь
}
