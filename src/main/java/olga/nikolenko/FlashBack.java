package olga.nikolenko;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
public final class FlashBack implements Cloneable {
    private final String memoryOwnerName;
    private final String title;
    private final String description;
    private final LocalDateTime memoryDateTime;
    private final List<String> tags;

    public FlashBack(String memoryOwnerName, String title,
                     String description, LocalDateTime memoryDateTime,
                     @NonNull List<String> tags) {
        this.memoryOwnerName = memoryOwnerName;
        this.title = title;
        this.description = description;
        this.memoryDateTime = memoryDateTime;
        this.tags = new ArrayList<>(tags);
    }

    public FlashBack(FlashBack other) {
        this.memoryOwnerName = other.memoryOwnerName;
        this.title = other.title;
        this.description = other.description;
        this.memoryDateTime = other.memoryDateTime;
        this.tags = new ArrayList<>(other.tags);
    }

    public List<String> getTags() {
        return List.copyOf(tags);
    }

    @Override
    public FlashBack clone() {
        return new FlashBack(this);
    }
}
