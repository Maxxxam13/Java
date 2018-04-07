package lesson11z;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        if(rooms!=null) {
            int count = 0;
            for (Room room : rooms) {
                if (room != null) {
                    if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                        count++;
                    }
                }
            }
            Room[] findrooms = new Room[count];
            int i = 0;
            for (Room room : rooms) {
                if (room != null) {
                    if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                        findrooms[i] = room;
                        i++;
                    }
                }
            }
            return findrooms;
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
