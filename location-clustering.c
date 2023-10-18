#include <stdio.h>
#include <math.h>
#include <string.h>

#define MAX_LOCATION 200

struct Location {
    char name[50];
    double latitude;
    double longitude;
};

// Haversine formula to calculate the distance between two points on a sphere
double haversine(double lat1, double lon1, double lat2, double lon2) {
    double R = 6371.0;  // Radius of the Earth in kilometers
    double dlat = (lat2 - lat1) * M_PI / 180.0;
    double dlon = (lon2 - lon1) * M_PI / 180.0;
    double a = sin(dlat / 2) * sin(dlat / 2) + cos(lat1 * M_PI / 180.0) * cos(lat2 * M_PI / 180.0) * sin(dlon / 2) * sin(dlon / 2);
    double c = 2 * atan2(sqrt(a), sqrt(1 - a));
    double distance = R * c;
    return distance;
}

int main() {
    struct Location locations[MAX_LOCATION];
    int num_location = 0;

   
    FILE *file = fopen("worldcities.csv", "r");
    if (file == NULL) {
        printf("File not found.\n");
        return 1;
    }

  
    char line[1024];
    while (fgets(line, sizeof(line), file)) {
        char name[50];
        double latitude, longitude;
        if (sscanf(line, "%49[^,],%lf,%lf", name, &latitude, &longitude) == 3) {
            strcpy(locations[num_location].name, name);
            locations[num_location].latitude = latitude;
            locations[num_location].longitude = longitude;
            num_location++;
        }
    }
    fclose(file);

    
    int cluster[MAX_LOCATION] = {0}; 
    int cluster_count = 0;

    for (int i = 0; i < num_locations; i++) {
        if (!cluster[i]) {
            int cluster_size = 1;
            printf("Cluster %d:\n", cluster_count + 1);
            printf("%s\n", locations[i].name);
            for (int j = i + 1; j < num_location; j++) {
                if (!cluster[j]) {
                    double distance = haversine(locations[i].latitude, locations[i].longitude, locations[j].latitude, locations[j].longitude);
                    if (fabs(locations[i].latitude - locations[j].latitude) <= 10.0 && distance <= 1113.0) {
                        cluster_size++;
                        clustered[j] = 1;
                        printf("%s\n", locations[j].name);
                    }
                }
            }
            printf("\n");
            cluster_count++;
        }
    }

    return 0;
}
