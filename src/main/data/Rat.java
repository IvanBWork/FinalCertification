package main.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rat implements Animal {
    private String name;
    private String color;
    private List<String> commands;
    private String dateBirth;

    public Rat() {
        this("", "", "", new ArrayList<>());
    }

    public Rat(String name, String color, String dateBirth, List<String> commands) {
        this.name = name;
        this.color = color;
        this.commands = commands;
        this.dateBirth = dateBirth;
    }

    /**
     * Получить имя животного.
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Установить имя животного.
     * @param name - новое имя
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Пополнить список команд животного.
     * @param newCommand - новая команда.
     */
    @Override
    public void addCommand(String newCommand) {
        commands.add(newCommand);
    }

    /**
     * Удаление команды.
     * @param command - команда.
     */
    @Override
    public void removeCommand(String command) {
        commands.remove(command);
    }

    /**
     * Получить список команд.
     * @return
     */
    @Override
    public List<String> getCommandList() {
        return commands;
    }

    /**
     * Получить окрас животного.
     * @return
     */
    @Override
    public String getColor() {
        return this.color;
    }

    /**
     * Получить количество команд выполняемых животным.
     * @return
     */
    @Override
    public int getCommandCount() {
        return commands.size();
    }

    /**
     * Установить окрас животного.
     * @param color - новый окрас.
     */
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Установить дату рождения.
     * @param date
     */
    @Override
    public void setDateBirth(String date) {
        this.dateBirth = date;
    }

    /**
     * Получить дату рождедния.
     * @return
     */
    @Override
    public String getDateBirth() {
        return this.dateBirth;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Крыса ").append(name).append(" ").append(color).append(" - ").append(dateBirth);

        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rat rat = (Rat) o;
        return Objects.equals(name, rat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
