package my_cargonaut.utility.data_classes.offers;

import my_cargonaut.utility.data_classes.Location;
import my_cargonaut.utility.data_classes.Measurements;
import my_cargonaut.utility.data_classes.Vehicle;
import my_cargonaut.utility.data_classes.user.User;

import java.util.*;
import java.util.stream.Collectors;

public class OfferPool implements java.io.Serializable {

    private static OfferPool instance;

    private final List<Offer> offerList;

    private OfferPool() {
        this. offerList = new LinkedList<>();
    }

    public static OfferPool getInstance() {
        if(OfferPool.instance == null) {
            OfferPool.instance = new OfferPool();
        }
        return OfferPool.instance;
    }

    public boolean addOffer(Offer offer) {
        return this.offerList.add(offer);
    }

    public void purgePool(String pw) throws IllegalAccessError{
        if(pw.equals("rosebuds")){
            this.offerList.clear();
        }else{
            throw new IllegalAccessError();
        }

    }

    public OfferFilter getOfferFilter() {
        return new OfferFilter();
    }


    public class OfferFilter {

        private User user;
        private String startLocName, destLocName;
        private Location startLoc, destLoc;
        private Date startD, endD;
        private Measurements freeSpace;
        private Map<String, Double> measurements;
        private Vehicle vehicle;
        private long offerID;

        private OfferFilter() {
            measurements = new HashMap<>();
            offerID = -1L;
        }

        public List<Offer> applyFilter() {
            return filterOffers(this);
        }

        private List<Offer> filterOffers(OfferFilter filter) {
            return offerList.stream()
                    .filter(offer -> {
                        if(filter.user != null) {
                            if(!filter.user.equals(offer.getUser())) return false;
                        }
                        if(filter.startLoc != null) {
                            if(!filter.startLoc.equals(offer.getRoute().getStartLoc())) return false;
                        } else {
                            if(filter.startLocName != null && !filter.startLocName.equals(offer.getRoute().getStartLoc().getLocationName())) {
                                return false;
                            }
                        }
                        if(filter.destLoc != null) {
                            if(!filter.destLoc.equals(offer.getRoute().getEndLoc())) return false;
                        } else {
                            if(filter.destLocName != null && !filter.destLocName.equals(offer.getRoute().getEndLoc().getLocationName())) {
                                return false;
                            }
                        }
                        if(filter.startD != null) {
                            Date offerStartDate = offer.getRoute().getStartTime();
                            if(!filter.startD.equals(offer.getRoute().getStartTime())) {
                                if(filter.startD.after(offerStartDate)) return false;
                            }
                            if(filter.endD != null) {
                                if(filter.endD.before(offerStartDate)) return false;
                            }
                        }
                        if(filter.freeSpace != null) {
                            if(offer.getFreeSpace().isPresent()) {
                                Measurements cargoMeas = filter.freeSpace;
                                Measurements cargoHold = offer.getFreeSpace().get();

                                return (!(cargoHold.getHeight() < cargoMeas.getHeight()))
                                        && (!(cargoHold.getWidth() < cargoMeas.getWidth()))
                                        && (!(cargoHold.getDepth() < cargoMeas.getDepth()))
                                        && (!(cargoHold.getWeight() < cargoMeas.getWeight()));
                            }
                        } else {
                            if(offer.getFreeSpace().isPresent()) {
                                Measurements cargoHold = offer.getFreeSpace().get();
                                if(filter.getHeight().isPresent() && cargoHold.getHeight() < filter.getHeight().get()) return false;
                                if(filter.getWidth().isPresent() && cargoHold.getWidth() < filter.getWidth().get()) return false;
                                if(filter.getDepth().isPresent() && cargoHold.getDepth() < filter.getDepth().get()) return false;
                                return filter.getWeight().isEmpty() || !(cargoHold.getWeight() < filter.getWeight().get());
                            }
                        }
                        return true;
                    }).collect(Collectors.toCollection(LinkedList::new));
        }

        public void setMeasurementsMap(Map<String, Double> measMap) {
            this.measurements = measMap;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setStartLocName(String name) {
            this.startLocName = name;
        }

        public void setDestLocName(String name) {
            this.destLocName = name;
        }

        public void setStartLoc(Location startLoc) {
            this.startLoc = startLoc;
        }

        public void setDestLoc(Location destLoc) {
            this.destLoc = destLoc;
        }

        public void setStartDate(Date startD) {
            this.startD = startD;
        }

        public void setEndDate(Date endD) {
            this.endD = endD;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public void setOfferID(long offerID) {
            this.offerID = offerID;
        }

        public void setFreeSpace(Measurements freeSpace) {
            this.freeSpace = freeSpace;
        }

        public Optional<Double> getHeight() {
            return Optional.ofNullable(measurements.get("height"));
        }

        public Optional<Double> getWidth() {
            return Optional.ofNullable(measurements.get("width"));
        }

        public Optional<Double> getDepth() {
            return Optional.ofNullable(measurements.get("depth"));
        }

        public Optional<Double> getWeight() {
            return Optional.ofNullable(measurements.get("weight"));
        }

        public Optional<User> getUser() {
            return Optional.ofNullable(user);
        }

        public Optional<Location> getStartLocation() {
            return Optional.ofNullable(startLoc);
        }

        public Optional<Location> getDestLoc() {
            return Optional.ofNullable(destLoc);
        }

        public Optional<String> getStartLocName() {
            return Optional.ofNullable(startLocName);
        }

        public Optional<String> getDestLocName() {
            return Optional.ofNullable(destLocName);
        }

        public Optional<Date> getStartDate() {
            return Optional.ofNullable(startD);
        }

        public Optional<Date> getEndDate() {
            return Optional.ofNullable(endD);
        }

        public Optional<Measurements> getFreeSpace() {
            return Optional.ofNullable(freeSpace);
        }

        public Optional<Vehicle> getVehicle() {
            return Optional.ofNullable(vehicle);
        }
    }
}
