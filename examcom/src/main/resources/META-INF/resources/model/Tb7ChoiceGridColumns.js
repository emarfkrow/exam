/**
 * 選抜グリッド定義
 */

let Tb7ChoiceGridColumns = [];

$(function() {
    Tb7ChoiceGridColumns = [
        Column.text('CHOICE_ID', Messages['Tb7ChoiceGrid.choiceId'], 90, 'primaryKey numbering', null),
        Column.refer('SUM_ID', Messages['Tb7ChoiceGrid.sumId'], 90, '', 'SUM_ID'),
        Column.text('SUM_INFO', Messages['Tb7ChoiceGrid.sumInfo'], 300, '', null),
        Column.refer('SUM2_ID', Messages['Tb7ChoiceGrid.sum2Id'], 90, '', 'SUM2_ID'),
        Column.text('SUM2_INFO', Messages['Tb7ChoiceGrid.sum2Info'], 300, '', null),
        Column.refer('SUM3_ID', Messages['Tb7ChoiceGrid.sum3Id'], 90, '', 'SUM3_ID'),
        Column.text('SUM3_INFO', Messages['Tb7ChoiceGrid.sum3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7ChoiceGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
