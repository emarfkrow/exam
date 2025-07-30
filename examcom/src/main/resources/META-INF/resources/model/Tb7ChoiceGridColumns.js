/**
 * 択一グリッド定義
 */

let Tb7ChoiceGridColumns = [];

$(function() {
    Tb7ChoiceGridColumns = [
        Column.text('CHOICE_ID', Messages['Tb7ChoiceGrid.choiceId'], 90, 'primaryKey numbering', null),
        Column.text('SUM_ID', Messages['Tb7ChoiceGrid.sumId'], 90, '', null),
        Column.text('SUM2_ID', Messages['Tb7ChoiceGrid.sum2Id'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7ChoiceGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
