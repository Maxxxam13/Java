package lesson11z;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        if(apis!=null) {
            int count = 0;
            for (API api : apis) {
                if (api != null) {
                    if(api.findRooms(price, persons, city, hotel)!=null) {
                        count= count+(api.findRooms(price, persons, city, hotel).length);
                    }
                }
            }
            Room[] rooms = new Room[count];
            int i= 0;
            for (API api : apis) {
                if (api != null) {
                    if(api.findRooms(price, persons, city, hotel)!=null) {
                       for(Room room:api.findRooms(price, persons, city, hotel))
                       {
                           rooms[i] = room;
                           i++;
                       }


                    }
                }
            }
            return rooms;
        }
        return null;
    }

    public Room[] check(API api1, API api2) {
        if (api1 != null && api2 != null) {
            Room[] rooms1 = api1.getAll();
            Room[] rooms2 = api2.getAll();
            int count = 0;
            for (int i = 0; i < rooms1.length; i++) {
                for (int j = 0; j < rooms2.length; j++) {
                    if (rooms1 != null && rooms2 != null) {
                        if (rooms1[i].getPersons() == rooms2[j].getPersons() && rooms1[i].getPrice() == rooms2[j].getPrice() && rooms1[i].getHotelName() == rooms2[j].getHotelName() && rooms1[i].getCityName() == rooms2[j].getCityName()) {
                            count++;
                        }
                    }
                }
            }
            Room[] roomsSame = new Room[count];
            int k = 0;
            for (int i = 0; i < rooms1.length; i++) {
                for (int j = 0; j < rooms2.length; j++) {
                    if (rooms1 != null && rooms2 != null) {
                        if (rooms1[i].getPersons() == rooms2[j].getPersons() && rooms1[i].getPrice() == rooms2[j].getPrice() && rooms1[i].getHotelName() == rooms2[j].getHotelName() && rooms1[i].getCityName() == rooms2[j].getCityName()) {
                            roomsSame[k] = rooms1[i];
                            k++;
                        }
                    }
                }
            }
            return roomsSame;
        }
        return null;
    }
}
