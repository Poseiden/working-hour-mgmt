package hr.model.domain.model.project_management.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubProject {
    private String id;
    private List<String> effortIdList;
    private List<String> subEntryId;
}
