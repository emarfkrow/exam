/**
 * 参照元グリッド定義
 */

let Tb4SanshoMotoGridColumns = [];

$(function() {
    Tb4SanshoMotoGridColumns = [
        Column.text('REF_ID', Messages['Tb4SanshoMotoGrid.refId'], 90, 'primaryKey numbering', null),
        Column.refer('IDREF_ID', Messages['Tb4SanshoMotoGrid.idrefId'], 90, '', 'IDREF_MEI'),
        Column.text('IDREF_MEI', Messages['Tb4SanshoMotoGrid.idrefMei'], 300, '', null),
        Column.refer('CDREF_CD', Messages['Tb4SanshoMotoGrid.cdrefCd'], 90, '', 'CDREF_MEI'),
        Column.text('CDREF_MEI', Messages['Tb4SanshoMotoGrid.cdrefMei'], 300, '', null),
        Column.refer('NOREF_NO', Messages['Tb4SanshoMotoGrid.norefNo'], 90, '', 'NOREF_MEI'),
        Column.text('NOREF_MEI', Messages['Tb4SanshoMotoGrid.norefMei'], 300, '', null),
        Column.refer('BETSU_IDREF_ID', Messages['Tb4SanshoMotoGrid.betsuIdrefId'], 90, '', 'BETSU_IDREF_MEI'),
        Column.refer('IDBN_BN', Messages['Tb4SanshoMotoGrid.idbnBn'], 90, '', 'IDBN_NO'),
        Column.text('IDBN_NO', Messages['Tb4SanshoMotoGrid.idbnNo'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb4SanshoMotoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
