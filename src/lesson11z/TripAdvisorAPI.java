package lesson11z;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        if (rooms != null) {
            int count = 0;
            for (Room room : rooms) {
                if (room != null) {
                    if (room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel) {
                        if (room.getPersons() >= persons-1&&room.getPersons() <= persons+1)
                            count++;
                    }
                }
            }
            Room[] findrooms = new Room[count];
            int i = 0;
            for (Room room : rooms) {
                if (room != null) {
                    if (room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel) {
                        if (room.getPersons() >= persons-1&&room.getPersons() <= persons+1){
                            findrooms[i] = room;
                            i++;
                        }
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
