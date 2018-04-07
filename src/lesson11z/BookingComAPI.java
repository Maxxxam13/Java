package lesson11z;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        if (rooms != null) {
            int count = 0;
            for (Room room : rooms) {
                if (room != null) {
                    if (room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                        if (room.getPrice() == price) {
                            count++;
                        } else if (price - 100 > 0 && room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
                            count++;
                        } else if (price - 100 < 0 && room.getPrice() >= 0 && room.getPrice() <= price + 100) {
                            count++;
                        }
                    }
                }
            }
            Room[] findrooms = new Room[count];
            int i = 0;
            for (Room room : rooms) {
                if (room != null) {
                    if (room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                        if (room.getPrice() == price) {
                            findrooms[i] = room;
                            i++;
                        } else if (price - 100 > 0 && room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
                            findrooms[i] = room;
                            i++;
                        } else if (price - 100 < 0 && room.getPrice() >= 0 && room.getPrice() <= price + 100) {
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
