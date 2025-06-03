/**
 * 再帰グリッド定義
 */

let Tb4SaikiGridColumns = [];

$(function() {
    Tb4SaikiGridColumns = [
        Column.text('SAIKI_ID', Messages['Tb4SaikiGrid.saikiId'], 90, 'primaryKey numbering', null),
        Column.refer('IDREF_ID', Messages['Tb4SaikiGrid.idrefId'], 90, '', 'IDREF_MEI'),
        Column.refer('CDREF_CD', Messages['Tb4SaikiGrid.cdrefCd'], 90, '', 'CDREF_MEI'),
        Column.refer('NOREF_NO', Messages['Tb4SaikiGrid.norefNo'], 90, '', 'NOREF_MEI'),
        Column.refer('BETSU_IDREF_ID', Messages['Tb4SaikiGrid.betsuIdrefId'], 90, '', 'BETSU_IDREF_MEI'),
        Column.text('REF_BN', Messages['Tb4SaikiGrid.refBn'], 90, '', null),
        Column.text('OYA_SAIKI_ID', Messages['Tb4SaikiGrid.oyaSaikiId'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb4SaikiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
