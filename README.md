# hydra-types-service

This repository began life as a clone of Caliber's
[TypesService](https://github.com/revaturelabs/caliber/tree/MSA/TypesService),
using Caliber's .gitignore.  In the Hydra microservices ecosystem, the Types
service is planned to be expanded for Assignforce to access its functionality
as well.

The Types service currently is used only for fetching Lists of all Types of
Skills, Trainings, Training Statuses, Notes, QC Statuses, Assessments, Trainer
Tiers, Panel Statuses, and Interview Formats.  According to the controller's
Javadocs, the controller returns the Lists for selection on the UI.
