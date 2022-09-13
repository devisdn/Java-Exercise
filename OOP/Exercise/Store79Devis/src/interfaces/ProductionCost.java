package interfaces;

public interface ProductionCost {
    Double  PRODUCTION_COST_ITEMS_PERCENTAGE = 1.1,
            PRODUCTION_COST_PACKET_DATA_PERCENTAGE = 0.7,
            PRODUCTION_COST_PACKET_DEFAULT_PERCENTAGE = 0.9;

    void calculateProductionCost();
}
