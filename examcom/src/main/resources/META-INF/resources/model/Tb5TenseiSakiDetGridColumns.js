/**
 * 転生先明細グリッド定義
 */

let Tb5TenseiSakiDetGridColumns = [];

$(function() {
    Tb5TenseiSakiDetGridColumns = [
        Column.text('TENSEI_SAKI_ID', Messages['Tb5TenseiSakiDetGrid.tenseiSakiId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_SAKI_BN', Messages['Tb5TenseiSakiDetGrid.tenseiSakiBn'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_SAKI_DET_INFO', Messages['Tb5TenseiSakiDetGrid.tenseiSakiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiSakiDetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
