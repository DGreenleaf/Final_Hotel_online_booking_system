package dao;

import entities.Room;
import util.TextUtil;

import java.util.List;

public class RoomDao implements Dao<Room>{
    @Override
    public void add(Room room) {
        TextUtil.writeToFile(TextUtil.getRoomFileName(), roomToLine(room));
    }

    @Override
    public void update(Room room) {

    }

    @Override
    public void delete(long id) {
        TextUtil.deleteFromFile(TextUtil.getRoomFileName(), id );

    }

    @Override
    public Room findByID(long id) {
        return null;
    }

    @Override
    public List<Room> getAll() {
        return null;
    }

    private String roomToLine(Room room) {
        StringBuffer stringRoom = new StringBuffer();

        stringRoom.append(room.getId()).append(TextUtil.getSeparator());
        stringRoom.append(room.getRoomNumber()).append(TextUtil.getSeparator());
        stringRoom.append(room.getPersons()).append(TextUtil.getSeparator());
        stringRoom.append(room.getRoomType().name()).append(TextUtil.getSeparator());
        stringRoom.append(room.getPrice()).append(TextUtil.getSeparator());
        stringRoom.append(room.getReservedForUser().getId());

        return stringRoom.toString();
    }
}
