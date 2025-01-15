/**
 * 子グリッド定義
 */

let Tb1KoGridColumns = [];

$(function() {
    Tb1KoGridColumns = [
        Column.comma('SOSEN_ID', Messages['Tb1KoGrid.sosenId'], 80, 'primaryKey numbering', null),
        Column.comma('OYA_BN', Messages['Tb1KoGrid.oyaBn'], 80, 'primaryKey numbering', null),
        Column.comma('ENTITY_BN', Messages['Tb1KoGrid.entityBn'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb1KoGrid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KO_MEI', Messages['Tb1KoGrid.koMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb1KoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1KoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1KoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
